package programe.learning;

public class Student extends LibraryMember {
    private String nim;

    public Student(String name, int memberId, String address, String nim) {
        super(name, memberId, address);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
        book.setAvailable(false);
        System.out.println(getName() + " (Student) Telah Meminjam Buku: " + book.getTitle());
        System.out.println("Pengarang : " + book.getAuthor());
        System.out.println("Deskripsi : " + book.getDescription());
        System.out.println("Harga     : Rp. " + book.getPrice());
        System.out.println("Alamat    : " + getAddress());
        System.out.println("NIM       : " + getNim());
        System.out.println("ID Member : " + getMemberId());
        } else {
            System.out.println("Maaf, buku dengan data :");
            System.out.println("Buku      : "+book.getTitle());
            System.out.println("Pengarang : "+book.getAuthor());
            System.out.println("Deskripsi : "+book.getDescription());
            System.out.println("Harga     : "+book.getPrice());
            System.out.println("Tidak Tersedia, Silahkan Pilih Buku yang lain.");
        }
    }

    @Override
    public void returnBook(Book book, int daysLate) {
        book.setAvailable(true);
        if (daysLate > 0) {
            int denda = daysLate * 2000; // Denda 2000 per hari
            System.out.println(getName() + " Telat Mengembalikan Buku. Denda: Rp. " + denda);
        } else {
            System.out.println("Atas Nama : "+getName() + " Telah Melakukan Pengembalian Tepat Waktu.");
        }
    }
    
}
