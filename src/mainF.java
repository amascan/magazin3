/**
 * Created by Adrian on 19.09.2016.
 */
public class mainF {
    public static void main(String[] args) {
        CitireFisier.read("date.xml");
      //  System.out.println(CitireFisier.read("date.xml"));
     /*   String xml = new String("<produse>\n" +
                "    <produs>\n" +
                "        <nume>Frigider Zanussi AB1</nume>\n" +
                "        <pret>1200</pret>\n" +
                "        <cod>FZAB1</cod>\n" +
                "        <reducere>10</reducere>\n" +
                "        <latime>70</latime>\n" +
                "        <adancime>70</adancime>\n" +
                "        <inaltime>205</inaltime>\n" +
                "        <categorie>electrocasnice</categorie>\n" +
                "    </produs>\n" +
                "    <produs>\n" +
                "        <nume>Samsung S7</nume>\n" +
                "        <pret>4200</pret>\n" +
                "        <cod>TMSS7</cod>\n" +
                "        <reducere>10</reducere>\n" +
                "        <latime>5.5</latime>\n" +
                "        <adancime>0.9</adancime>\n" +
                "        <inaltime>11.5</inaltime>\n" +
                "        <categorie>telefoane</categorie>\n" +
                "    </produs>    \n" +
                "</produse>");
*/

    }
    public static String search (String tagname, String xml) {
        String txt;
        int start = xml.indexOf("<"+tagname+">");
        start = start + tagname.length() + 2 ;
        int end = xml.indexOf("</"+tagname+">");
        txt = xml.substring(start, end);
   //     System.out.println(txt);
        return txt;

    }

}
