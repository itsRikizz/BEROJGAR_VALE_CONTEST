import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        InputStream inputStream = System.in;

        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);

        OutputWriter out = new OutputWriter(outputStream);

        

        int n=Integer.parseInt(in.next());

        

        int a[] = new int[n];

        for(int t=0;t<n;t++){

            a[t] = Integer.parseInt(in.next());

        }

        

        Arrays.sort(a);

        

        int b[] = new int[n];

        int i=0,j=0,k=n-1;

        while(i<n){

            if(i%2 == 0)b[i++] = a[j++];

            else b[i++] = a[k--];

        }

        

        for(int t=1;t<n;t++){

            if(t%2 == 0)b[t] = b[t-1] + b[t];

            else b[t] = b[t-1] - b[t];

        }

        

        for(int t=0;t<n;t++){

            out.print(b[t]+" ");

        }

        out.close();

    }



    

    static class InputReader {

        BufferedReader reader;

        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {

            reader = new BufferedReader(new InputStreamReader(stream), 32768);

            tokenizer = null;

        }



        public String next() {

            while (tokenizer == null || !tokenizer.hasMoreTokens()) {

                try {

                    tokenizer = new StringTokenizer(reader.readLine());

                } catch (IOException e) {

                    throw new RuntimeException(e);

                }

            }

            return tokenizer.nextToken();

        }



        public int nextInt() {

            return Integer.parseInt(next());

        }



    }



    static class OutputWriter {

        private final PrintWriter writer;



        public OutputWriter(OutputStream outputStream) {

            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));

        }



        public OutputWriter(Writer writer) {

            this.writer = new PrintWriter(writer);

        }



        public void print(Object... objects) {

            for (int i = 0; i < objects.length; i++) {

                if (i != 0) {

                    writer.print(' ');

                }

                writer.print(objects[i]);

            }

        }



        public void println(Object... objects) {

            print(objects);

            writer.println();

        }



        public void close() {

            writer.close();

        }



        public void println(int i) {

            writer.println(i);

        }



    }
}