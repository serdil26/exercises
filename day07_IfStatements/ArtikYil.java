package If_Else;

public class ArtikYil {

	public static void main(String[] args) {
		int yil = 1984;
        boolean artikyil = false;

        if(yil % 4 == 0)
        {
            if( yil % 100 == 0)
            {
                if ( yil % 400 == 0)
                    artikyil = true;
                else
                    artikyil = false;
            }
            else
                artikyil = true;
        }
        else
            artikyil = false;

        if(artikyil)
            System.out.println(yil + " artýk yýldýr.");
        else
            System.out.println(yil + " artýk yýl deðildir.");

	}

}
