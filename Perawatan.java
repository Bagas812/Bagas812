            pnl("Menu Masker");
            pnl("1. Masker Buah");
            pnl("2. Masker Lumpur");
        } else if (getJenisPerawatan() == 3) {
            pnl("Menu Potong Rambut");
            pnl("1. Tidak Keramas");
            pnl("2. Keramas");
        }
        pnl(" ----------------------o0o----------------------  ");
        p("Masukan Pilihan Anda :");
        setTipePerawatan(sc.nextInt());
        pnl(" ----------------------o0o----------------------  ");
        p("Berapa Orang : ");
        setJumlah(sc.nextInt());
        setHarga(getHargaTotal());
        pnl("Data Tersimpan");
        pnl("Harga Sebesar : Rp." + getHarga());
        addTotalHarga(getHarga());
    }

    public int getHargaTotal() {
        return getHargaType(getJenisPerawatan(), getTipePerawatan()) * getJumlah();
    }
    public int getHargaType(int jenisPerawatan,int typePerawatan) {
        int typeHarga = 0;
        if (jenisPerawatan == 1) {
            if (typePerawatan == 1) {
                typeHarga = 50000;
            } else if (typePerawatan == 2) {
                typeHarga = 100000;
            } 
        } else if (jenisPerawatan == 2) {
            if (typePerawatan == 1) {
                typeHarga = 40000;
            } else if (typePerawatan == 2) {
                typeHarga = 75000;
            } 
        }else if (jenisPerawatan == 3) {
            if (typePerawatan == 1) {
                typeHarga = 20000;
            } else if (typePerawatan == 2) {
                typeHarga = 35000;
            } 
        }

        return typeHarga;
    }


    // Helper
    static void p(String text) {
        System.out.print(text);
    }

    static void pnl(String text) {
        System.out.println(text);
    }
}
