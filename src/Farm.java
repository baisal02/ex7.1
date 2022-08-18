public class Farm {
    private String adress;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[]koilor;
    private String OwnerName;

    public Farm(String adress, Cow[] cows, Horse[] horses, Sheep[] koilor, String ownerName) {
        this.adress = adress;
        this.cows = cows;
        this.horses = horses;
        this.koilor = koilor;
        OwnerName = ownerName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getKoilor() {
        return koilor;
    }

    public void setKoilor(Sheep[] koilor) {
        this.koilor = koilor;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }
}
