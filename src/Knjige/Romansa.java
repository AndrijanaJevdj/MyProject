package Knjige;



public class Romansa extends Knjiga{
    public Romansa(String naslov, String zanr, int godinaIzdanja, String autor, int brojProdatihKopija) {
        super(naslov, zanr, godinaIzdanja, autor, brojProdatihKopija);
    }

    public Romansa(String naslov, String zanr, int godinaIzdanja, String autor) {
        super(naslov, zanr, godinaIzdanja, autor);
    }

    public Romansa(String naslov, String zanr, int godinaIzdanja) {
        super(naslov, zanr, godinaIzdanja);
    }
}
