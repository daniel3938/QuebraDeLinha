import java.io.RandomAccessFile;

public class Principal {

    public static void main(String args[]) throws Exception 
    {
    	if (args.length != 1) 
        {     
        	System.err.println("Erro na chamada do comando.");
            System.err.println("Uso: java Principal [arquivo].");
            System.exit(1);
        } 
    	RandomAccessFile f = new RandomAccessFile(args[0], "r");
        Struct s = new Struct();
        String b;
        char c;
        int n = 0;
        for (int i=0;i < f.length();i++)
        {
        	f.seek(i);
        	s.leStruct(f);
        	b = s.getSigla();
        	c = b.charAt(0);
        	if (c == '\n') 
        		n = n+1;
        }
        System.out.println("Numero de quebras de linha no arquivo: ");
        System.out.println(n);
        f.close();
    }
}

