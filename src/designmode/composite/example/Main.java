package designmode.composite.example;

class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory usr = new Directory("usr");
        Directory tmp = new Directory("tmp");
        Directory yuki = new Directory("yuki");
        Directory hanako = new Directory("hanako");
        Directory tomura = new Directory("tomura");

        File vi = new File("vi",10000);
        File latex = new File("latex",20000);
        File diary_html = new File("diary.html",100);
        File composite_java = new File("Composite.java",200);
        File memo_tex = new File("memo.tex",300);
        File game_doc = new File("game.doc",400);
        File iunk_mail = new File("iunk.mail",500);

        root.add(bin);
        root.add(tmp);
        root.add(usr);

        bin.add(vi);
        bin.add(latex);

        usr.add(yuki);
        usr.add(hanako);
        usr.add(tomura);

        yuki.add(diary_html);
        yuki.add(composite_java);

        hanako.add(memo_tex);

        tomura.add(game_doc);
        tomura.add(iunk_mail);

        //root.printList();
        root.traverse();
    }
}
