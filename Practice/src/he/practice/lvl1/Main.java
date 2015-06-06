package he.practice.lvl1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
 
public class Main {
    static InputStream is;
    static PrintWriter out;
    static String INPUT = "";
    static int mod = 1000000007;
    static int[][] SC;
    
    public static long inv(long a, int p)
    {
        long ret = 1;
        long mul = a;
        for(long n = p-2;n > 0;n >>>= 1){
            if((n&1)==1)ret = ret * mul % p;
            mul = mul * mul % p;
        }
        return ret;
    }
    
    static int[] INV;
    static int N;
    
    static long C(int n, int r)
    {
        if(n < 0 || r < 0 || r > n)return 0;
        if(r > n / 2)r = n - r;
        return MUL[n]*IMUL[n-r]%mod*IMUL[r]%mod;
    }
    
    static long[] MUL, IMUL;
    
    static void solve()
    {
        N = 5000;
        MUL = new long[N+1];
        IMUL = new long[N+1];
        MUL[0] = 1;
        IMUL[0] = 1;
        for(int i = 1;i <= N;i++){
            MUL[i] = MUL[i-1] * i % mod;
            IMUL[i] = IMUL[i-1] * inv(i, mod) % mod;
        }
        
        while(true){
            int n = ni(), k = ni();
            if(n == 0 && k == 0)break;
            long ret = 0;
            if(k % 2 == 0){
                ret += C(n-2,k/2)*C(n-2,k/2-1)*2%mod;
            }else{
                long b = C(n-2,(k+1)/2-1);
                ret += b*b*2%mod;
            }
            out.println(ret%mod);
        }
    }
    
    public static void main(String[] args) throws Exception
    {
        long S = System.currentTimeMillis();
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);
        
        solve();
        out.flush();
        long G = System.currentTimeMillis();
        tr(G-S+"ms");
    }
    
    static boolean eof()
    {
        try {
            is.mark(1000);
            int b;
            while((b = is.read()) != -1 && !(b >= 33 && b <= 126));
            is.reset();
            return b == -1;
        } catch (IOException e) {
            return true;
        }
    }
        
    static int ni()
    {
        try {
            int num = 0;
            boolean minus = false;
            while((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'));
            if(num == '-'){
                num = 0;
                minus = true;
            }else{
                num -= '0';
            }
            
            while(true){
                int b = is.read();
                if(b >= '0' && b <= '9'){
                    num = num * 10 + (b - '0');
                }else{
                    return minus ? -num : num;
                }
            }
        } catch (IOException e) {
        }
        return -1;
    }
    
    static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
}