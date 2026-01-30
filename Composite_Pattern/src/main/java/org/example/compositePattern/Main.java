package org.example.compositePattern;

public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new FileLeaf("a.txt");
        FileSystemComponent file2 = new FileLeaf("b.doc");

        FolderComposite folder = new FolderComposite("Documents");
        folder.add(file1);
        folder.add(file2);

        FolderComposite root = new FolderComposite("Root");
        root.add(folder);

        root.showInfo();
    }
}

// giải thích
// sẽ tạo ra 2 ọbject file lưu ở RAM
// tiếptucj tạo thư mục document (Ram)
// document chứa 2 file a và b
// root chứa document

