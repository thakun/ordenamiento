package Ordenamiento;


public class Ordenamiento {

    private int[] list;

    public int[] getList(){
        return this.list;
    }

    public void setList(int[] list){
        this.list = list;
    }

    public int[] orderList(){
        int j = 0;
        int[] list_1 = this.list;

        for(int i = 0; i < list_1.length; i++){
            int actual = list_1[i];
            j = i;
            while(j > 0 && list_1[j-1] < actual){
                list_1[j] = list_1[j-1];
                j--;
            }
            list_1[j] = actual;
        }

        return list_1;
    }

    public static void main(String[] args) {
        int[] list = {1,2,8,44,9,26,3,7,33,1,93,417,19,27,14,11,30,4};
        Ordenamiento o = new Ordenamiento();
        o.setList(list);
        int[] new_list = o.orderList();

        for(int i = 0; i < new_list.length; i++){
            System.out.println(list[i]);
        }

        
        
    }

}
