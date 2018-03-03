package stringiþlem;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String deðer;
		
		deðer=" bugün günlerden cumartesi...u ";
		
		System.out.println(deðer);
		
		//string uzunluðu bulmak
		System.out.println(deðer.length()); 
		
		//stringin baþý ve sonundaki boþlýklarý kýrpmak  

		System.out.println(deðer.trim());
		
		//string içinde deðiþiklik yapmak
		System.out.println(deðer.replace("c", "C"));
		System.out.println(deðer.replace(" ", ""));
		
		//diziler 0 dan baþlar //bir string içinde index numarasý verilen karakteri verir
		System.out.println(deðer.charAt(4));
		
		//bir string içinden verilen index aralýðýnda deðeri verir
		System.out.println(deðer.substring(7, 16));
		
		//iki string deðerini sadece metin olarak birleþtirmek için kullanýlýr 
		System.out.println(deðer.concat("neden"));
		
		//+ile birleþtiði zaman stringlerin ikisinede tanýmlý olan özelliklerde birleþir
		System.out.println(deðer+"neden???");
		
		//iki string içeriðiðn doðruluðunu gösterir
		
		System.out.println(deðer.equals("içerik"));
		System.out.println(deðer=="içerik");
		
		
		//BÝR STRÝNG ÝÇÝNDEKÝ KARAKTERÝN YERÝNÝ VERÝR
		//ilk index i verir
		System.out.println(deðer.indexOf("ü"));
		//son indexi verir
		System.out.println(deðer.lastIndexOf("u"));
		//BULAMADIÐI DEÐERE -1 VERÝR
		System.out.println(deðer.indexOf("Þ"));
		
		
		//bir string ifadenin boþ olup olmadýðýný belirtir 
		//deðer boþ ise true dolu ise false döner 
		deðer="HERÞEY büyük harfle mi yazýlýr ?";
		System.out.println(deðer.isEmpty());
		
		//verilen string ifadeyi küçük harfe çevirir
		System.out.println(deðer.toLowerCase());
		// verilen string ifadeyi büyük harf yapar 
		System.out.println(deðer.toUpperCase());
		
		
		//BÝR STRÝNG DÝZÝSÝNÝ VERÝLEN ÝFADEYE GÖRE  PARÇALARA BÖLER 
		//HERBÝR PARÇA ÝÇÝN STRÝNG DÝZÝSÝ OLUÞTURULUR
		deðer="ad:ali,soyad:ALÝ,telefon:0555 555 5555";
		System.out.println(deðer.split(",")[0].split(":")[1]);
		System.out.println(deðer.split(",")[1]);
		System.out.println(deðer.split(",")[2]);
		
		
		
		
	}

}


















