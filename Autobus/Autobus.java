public class Autobus
{
    private String  Kennzeichen;
    private      int Sitzplatze;
    private    boolean anhänger;
    
    
    public Autobus (String neuKennzeichen, int neuSitzplatze, boolean neuAnhänger)
    {
        setKennzeichen(neuKennzeichen);
        setSitzplatze (neuSitzplatze);
        setAnhänger(neuAnhänger);
        
    }
    
    public Autobus (int neuSitzplatze, boolean neuAnhänger)
    {
        setKennzeichen("W-1234A");
        setSitzplatze (neuSitzplatze);
        setAnhänger(neuAnhänger);
        
    }

    public Autobus (String neuKennzeichen, int neuSitzplatze)
    {
        setKennzeichen(neuKennzeichen);
        setSitzplatze (neuSitzplatze);
        setAnhänger(false);
        
    }
    
    public Autobus (String neuKennzeichen, boolean neuAnhänger)
    {
        setKennzeichen(neuKennzeichen);
        setSitzplatze (29);
        setAnhänger(neuAnhänger);
        
    }
    
      public String getKennzeichen()
    {
        return Kennzeichen;
    }
    
      public int getSitzplatze()
    {
        return Sitzplatze;
    }
    
      public boolean getAnhänger()
    {
        return anhänger;
    }
    
    public void setKennzeichen (String neuKennzeichen)
    {
        Kennzeichen = neuKennzeichen;
    }
    
    public void setSitzplatze (int neuSitzplatze)
    {
        Sitzplatze = neuSitzplatze;
    }
    
    public void setAnhänger (boolean neuAnhänger)
    {
        anhänger = neuAnhänger;
    }

    
    
      

    
    
}