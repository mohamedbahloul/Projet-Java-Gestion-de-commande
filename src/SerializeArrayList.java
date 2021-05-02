import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class SerializeArrayList  extends Gestion{

  public void WriteProdInfos(ArrayList<Produit> P) {
	  
     try {
    	 Path chemin = Paths.get("Produit.txt");
  
         OutputStream output = null;
         try {

             output = new BufferedOutputStream(Files.newOutputStream(chemin));
             
             for(Produit p : P)
            	 output.write((p.Save()+"\n").getBytes());

             output.flush();
  

             output.close();
  
         } catch (Exception e) {
             System.out.println("Message " + e);
         }
  }catch(Exception e) {System.out.println("Message " + e);};
  }
  public void WriteCmdInfos(ArrayList<Commande> C) {
	  
	     try {
	    	 Path chemin = Paths.get("Commande.txt");
	  
	         OutputStream output = null;
	         try {

	             output = new BufferedOutputStream(Files.newOutputStream(chemin));
	             for(Commande c : C)
	            	 output.write((c.Save()+"\n").getBytes());

	             output.flush();
	  

	             output.close();
	  
	         } catch (Exception e) {
	             System.out.println("Message " + e);
	         }
	  }catch(Exception e) {System.out.println("Message " + e);};
	  }



  public ArrayList<Produit> ReadProd(ArrayList<Produit> P) {
      Path chemin = Paths.get("Produit.txt");
      InputStream input = null;
      try {
          input = Files.newInputStream(chemin);
           
          BufferedReader reader = new BufferedReader(new InputStreamReader(input));
          int i=0;
          while(reader.ready()){
    	  String s=reader.readLine();
          String [] Str = s.split("\t");
          P.add(new Produit(Str[0],Str[1],Float.parseFloat(Str[2]) ,Float.parseFloat(Str[3]),Integer.parseInt(Str[4])));
          P.get(i++).setSolde(Float.parseFloat(Str[5]));
          }
          input.close();
          

      } catch (IOException e) {
          System.out.println("Message " + e);
      }
      return P;
  }

  /*public ArrayList<Commande> ReadCmd(ArrayList<Commande> C) {
      Path chemin = Paths.get("Commande.txt");
      InputStream input = null;
      try {
          input = Files.newInputStream(chemin);
           
          BufferedReader reader = new BufferedReader(new InputStreamReader(input));

          while(reader.ready()){
    	  String s=reader.readLine();
          String [] Str = s.split("\t");
          //C.add(new Commande(Str[0],Str[1],Float.parseFloat(Str[2]) ,Float.parseFloat(Str[3]),Integer.parseInt(Str[4])));

          }
          input.close();
          

      } catch (IOException e) {
          System.out.println("Message " + e);
      }
      return P;
  }*/
}