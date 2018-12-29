/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author BADRUL
 */
public class AdjacencyMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
           String filelink="GRAPH.txt";
           File file=new File(filelink);
           Scanner B=new Scanner(file);
           String read=B.nextLine(); //1st line read
           StringTokenizer st=new StringTokenizer(read,","); //1st line split
           int v=Integer.parseInt(st.nextToken()); //vertex number
           int e=Integer.parseInt(st.nextToken()); //edge number
           int [][]a=new int[v][v];
           read=B.nextLine(); //2nd line read
           st=new StringTokenizer(read,","); //2nd line split
           
           while(st.hasMoreElements())
           {
               String s=st.nextToken();
               
               
               int n1=(s.codePointAt(0))-49;
               int n2=(s.codePointAt(1))-49;
               
               a[n1][n2]=1;
           }
           
           for(int i=0;i<v;i++) //printing adjacency matrix
           {
               for(int j=0;j<v;j++)
               {
                   System.out.print(a[i][j]+" ");
                  
               }
               System.out.println();
           }

        }
        catch(IOException e)
        {
            System.out.println("File not found");
        }
    }
    
}
