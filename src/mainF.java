/**
 * Created by Adrian on 19.09.2016.
 */
public class mainF {
    public static void main(String[] args) {
        String xml = CitireFisier.read("date.xml");

        String nume = search("nume" ,xml);
        double pret = Double.parseDouble(search("pret" ,xml));
        String cod = search("cod" ,xml);
        int reducere = Integer.parseInt(search("reducere" ,xml));
        double latime = Double.parseDouble(search("latime" ,xml));
        double adancime =Double.parseDouble(search("adancime" ,xml));
        double inaltime =Double.parseDouble(search("inaltime" ,xml));
        String categorie =search("categorie" ,xml);


        Produs prod1 = new Produs(nume, pret, cod, reducere, latime, adancime, inaltime, categorie);
        System.out.println(prod1);
    }

    public static String search (String tagname, String xml) {
        String txt;
        int start = xml.indexOf("<"+tagname+">");
        start = start + tagname.length() + 2 ;
        int end = xml.indexOf("</"+tagname+">");
        txt = xml.substring(start, end);
        return txt;

    }

}
