        pnl(" ----------------------o0o----------------------  ");
        p("Berapa Jam : ");
        setJumlahJam(sc.nextInt());
        setHarga(getHargaTotal());
        pnl("Data Tersimpan");
        pnl("Harga Sebesar : Rp." + getHarga());
        addTotalHarga(getHarga());
    }

    public int getHargaTotal() {
        return getHargaType(getJenisSewa(), getJenisMenu()) * getJumlahJam();
    }

    public int getHargaType(int opt1, int opt2) {
        int typeHarga = 0;
        if (opt1 == 1) {
            if (opt2 == 1) {
                typeHarga = 100000;
            } else if (opt2 == 2) {
                typeHarga = 250000;
            }
        } else if (opt1 == 2) {
            if (opt2 == 1) {
                typeHarga = 150000;
            } else if (opt2 == 2) {
                typeHarga = 350000;
            }
        } else if (opt1 == 3) {
            if (opt2 == 1) {
                typeHarga = 20000;
            } else if (opt2 == 2) {
                typeHarga = 50000;
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
