package stringi�lem;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String de�er;
		
		de�er=" bug�n g�nlerden cumartesi...u ";
		
		System.out.println(de�er);
		
		//string uzunlu�u bulmak
		System.out.println(de�er.length()); 
		
		//stringin ba�� ve sonundaki bo�l�klar� k�rpmak  

		System.out.println(de�er.trim());
		
		//string i�inde de�i�iklik yapmak
		System.out.println(de�er.replace("c", "C"));
		System.out.println(de�er.replace(" ", ""));
		
		//diziler 0 dan ba�lar //bir string i�inde index numaras� verilen karakteri verir
		System.out.println(de�er.charAt(4));
		
		//bir string i�inden verilen index aral���nda de�eri verir
		System.out.println(de�er.substring(7, 16));
		
		//iki string de�erini sadece metin olarak birle�tirmek i�in kullan�l�r 
		System.out.println(de�er.concat("neden"));
		
		//+ile birle�ti�i zaman stringlerin ikisinede tan�ml� olan �zelliklerde birle�ir
		System.out.println(de�er+"neden???");
		
		//iki string i�eri�i�n do�rulu�unu g�sterir
		
		System.out.println(de�er.equals("i�erik"));
		System.out.println(de�er=="i�erik");
		
		
		//B�R STR�NG ���NDEK� KARAKTER�N YER�N� VER�R
		//ilk index i verir
		System.out.println(de�er.indexOf("�"));
		//son indexi verir
		System.out.println(de�er.lastIndexOf("u"));
		//BULAMADI�I DE�ERE -1 VER�R
		System.out.println(de�er.indexOf("�"));
		
		
		//bir string ifadenin bo� olup olmad���n� belirtir 
		//de�er bo� ise true dolu ise false d�ner 
		de�er="HER�EY b�y�k harfle mi yaz�l�r ?";
		System.out.println(de�er.isEmpty());
		
		//verilen string ifadeyi k���k harfe �evirir
		System.out.println(de�er.toLowerCase());
		// verilen string ifadeyi b�y�k harf yapar 
		System.out.println(de�er.toUpperCase());
		
		
		//B�R STR�NG D�Z�S�N� VER�LEN �FADEYE G�RE  PAR�ALARA B�LER 
		//HERB�R PAR�A ���N STR�NG D�Z�S� OLU�TURULUR
		de�er="ad:ali,soyad:AL�,telefon:0555 555 5555";
		System.out.println(de�er.split(",")[0].split(":")[1]);
		System.out.println(de�er.split(",")[1]);
		System.out.println(de�er.split(",")[2]);
		
		
		
		
	}

}


















