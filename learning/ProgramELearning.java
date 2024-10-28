package programe.learning;

public class ProgramELearning {

    public static void main(String[] args) {
        // Daftar Buku dalam Bentuk Array
        Book[] books = {
            new Book("Struktur Data", "Andi Sujarwo Tedjo", "Pengembangan Tentang Struktur Data dan Pemrograman", 57000),
            new Book("Teori Bahasa Otomata", "Asep Sutrisna", "Pengembangan Teori Input/Output Komputer", 50000),
            new Book("Algoritma dan Pemrograman", "Agus Tole", "Pemrograman bahasa dan alur algoritma pengembangan bahasa coding", 100000),
            new Book("Bahasa Inggris", "Asep Jhonson", "Penjelasan Verb, Objek dan Predikat", 80000),
        };

        // Membuat Anggota Perpustakaan
        LibraryMember student1 = new Student("Haris", 1001, "Pangandaran", "23552011143");
        LibraryMember student2 = new Student("Nizar", 1002, "Jakarta", "23552011178");
        LibraryMember lecture1 = new Lecture("Bapak Nurpazri, S.T.,M.Kom.", 2001, "Bandung", "1998023");
        LibraryMember lecture2 = new Lecture("Bapak Rismawan, S.Kom.,M.Kom.", 2002, "Bandung", "1987045");

        // Polimorfisme: Meminjam dan Mengembalikan Buku
        student1.borrowBook(books[0]);  // Haris meminjam "Struktur Data"
        System.out.println("\n");
        lecture1.borrowBook(books[0]);  // Bapak Nurpazri mencoba meminjam "Struktur Data" lagi
        System.out.println("\n");
        student2.borrowBook(books[3]);  // Nizar Meminjam "Bahasa Inggris"
        
        // Pengembalian Buku dengan Denda
        student1.returnBook(books[0], 2); // Haris mengembalikan buku dengan telat
        System.out.println("\n");
        lecture1.borrowBook(books[0]);  // Bapak Nurpazri mencoba meminjam "Struktur Data" lagi
        System.out.println("\n");
        student2.returnBook(books [3], 0); // Nizar mengembalikan buku
        System.out.println("\n");
        lecture1.returnBook(books[0], 0); // Bapak Nurpazri mengembalikan buku tepat waktu
    }
}
