public class stu {
    public static void main(String[] args) {

        student[] Student = {
                new student("null", "null", 1973, 104, 1,0),
                new student("Gökhan", "Bilgisayar müh.", 1985, 104, 1, 0),
                new student("Ayşe", "Makine müh.", 1985, 104, 1, 0),
                new student("Elif", "Elektrik-Elektronik müh.", 2020, 104, 1, 1.98),
        };

        System.out.println("ÖĞRENCİ BİLGİLERİ"); for (int i = 0; i < Student.length; i++) {
            if (Student[i].getGano()<0 || Student[i].getGano()>4) {
                throw new IllegalArgumentException(Student[i].getAd()+" "+"isimli öğrencinin gano bilgisi yanlış girilmiş");
            } else if (Student[i].getGirissirasi()<10) {
                System.out.println("OGR -"+ (i+1) + " " + Student[i].getAd() + " " + Student[i].getBolum() + " " +
                        Student[i].getGirisyili() + Student[i].getBolumkodu()
                        +"00"+Student[i].getGirissirasi() + " " +
                        Student[i].getGano());
            } else if (Student[i].getGirissirasi()<100 && Student[i].getGirissirasi()>10)
            {System.out.println("OGR -"+
                    (i+1) + " " + Student[i].getAd() + " " + Student[i].getBolum() + " " + Student[i].getGirisyili() + Student[i].getBolumkodu()
                    +"0"+Student[i].getGirissirasi() + " " +
                    Student[i].getGano());

            } else {
                System.out.println("OGR -"+ (i+1) + " " + Student[i].getAd() + " " + Student[i].getBolum() + " " +
                        Student[i].getGirisyili() + Student[i].getBolumkodu()
                        +Student[i].getGirissirasi() + " " +
                        Student[i].getGano());
            }
        }

        student.harcHesaplama(1); student.harcHesapla(1,2);


    }
}

