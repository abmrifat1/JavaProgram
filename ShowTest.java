public class ShowTest {
    public int x = 0;

    class FirstLevel {

        public int x = 1;
        void methodFirst(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShowTest.this.x);
        }

    }

    public static void main(String... args) {
        ShowTest st = new ShowTest();
        ShowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodFirst(3);
        try {
            int res = 100/0;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

   
    
}
