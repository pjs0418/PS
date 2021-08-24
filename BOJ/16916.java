import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            KMP kmp = new KMP();

            String s = br.readLine();
            String p = br.readLine();

            kmp.setPi(p);
            kmp.setCheckPInS(kmp.getPi(), s, p);

            int checkPInS = kmp.getCheckPInS();

            System.out.print(checkPInS);

        }
        catch(IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

class KMP {

    private int[] pi;
    private int checkPInS;

    void setPi(String p) {

        int pLen = p.length();
        pi = new int[pLen];
        int j, count, temp;

        this.pi[0] = 0;

        for(int i = 1;i < pLen;i++) {
            j = 0;
            count = 0;
            temp = i;

            if(p.charAt(i) != p.charAt(j)) {
                this.pi[i] = 0;
                continue;
            }

            while(true) {

                if(temp == p.length()) {
                    return;
                }

                if(p.charAt(temp) == p.charAt(j)) {
                    count++;
                    this.pi[temp] = count;
                    temp++;
                    j++;
                }
                else {
                    if(pi[j - 1] == 0) {
                        i = temp - 1;
                        break;
                    }

                    j = pi[j - 1];
                }
            }
        }
    }

    int[] getPi() {
        return pi;
    }

    void setCheckPInS(int[] pi, String s, String p) {
        int sLen = s.length();
        int j, temp;

        if(p.length() > s.length()) {
            this.checkPInS = 0;
            return;
        }

        for(int i = 0;i < sLen;i++) {
            j = 0;
            temp = i;

            while(true) {

                if(temp == s.length()) {
                    this.checkPInS = 0;
                    return;
                }

                if(s.charAt(temp) == p.charAt(j)) {
                    if((j + 1) == p.length()) {
                        this.checkPInS = 1;
                        return;
                    }

                    temp++;
                }
                else {

                    if(j == 0) {
                        break;
                    }

                    if(j > 0 && pi[j - 1] == 0) {
                        i = temp - 1;
                        break;
                    }

                    if(j > 0) {
                        j = pi[j - 1];
                        continue;
                    }

                }
                j++;
            }
        }
    }

    int getCheckPInS() {
        return checkPInS;
    }
}