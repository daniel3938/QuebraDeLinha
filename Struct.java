import java.io.DataInput;
import java.io.IOException;
import java.nio.charset.Charset;

public class Struct {
	  private String sigla;
	  public void leStruct(DataInput din) throws IOException
	    {
		  byte sigla[] = new byte[1];
		  din.readFully(sigla);
		  Charset enc = Charset.forName("ISO-8859-1");
		  this.sigla = new String(sigla,enc);
		  
	    }
	  public String getSigla() {
	        return sigla;
	    }
	     
	  public void setSigla(String sigla) {
	        this.sigla = sigla;
	    }
}