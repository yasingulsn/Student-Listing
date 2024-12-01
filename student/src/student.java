public class student { private String ad; private String bolum; private int girisyili; private int ogrNo; private double gano; private int bolumkodu; private int girissirasi;

    public student(String ad, String bolum, int girisyili, int bolumkodu, int girissirasi, double gano) {
        this.ad = ad; this.bolum = bolum; this.girisyili = girisyili;
        this.bolumkodu = bolumkodu; this.girissirasi = girissirasi; this.gano = gano;
    }


    public String getAd() { return ad;
    }

    public void setAd() { this.ad = ad;
    }

    public String getBolum() { return bolum;
    }

    public void setBolum(String bolum) { this.bolum = bolum;
    }

    public int getBolumkodu() { return bolumkodu;
    }

    public void setBolumkodu(int bolumkodu) { this.bolumkodu = bolumkodu;
    }

    public double getGano() { return gano;
    }

    public void setGano(double gano) { this.gano = gano;

    }

    public int getGirisyili() { return girisyili;
    }

    public void setGirisyili(int girisyili) { this.girisyili = girisyili;
    }

    public int getOgrNo() { return ogrNo;
    }

    public void setOgrNo(int ogrNo) { this.ogrNo = ogrNo;
    }

    public int getGirissirasi() { return girissirasi;

    }
    public void setGirissirasi(int girissirasi) { this.girissirasi = girissirasi;
    }

    static void harcHesaplama(double derssayisi) {

        System.out.println("3. öğrencinin ödeyeceği harç"+" "+derssayisi * 480);
    }

    static void harcHesapla(double derssayisi, double uzattigiyil) {
        System.out.println("4. öğrencinin ödeyeceği harç" + " " + derssayisi * 480 * uzattigiyil);

    }}