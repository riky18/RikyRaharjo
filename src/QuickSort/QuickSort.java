package QuickSort;

public class QuickSort {
    private String[] data;

    public void setData(String[] data){
        this.data = data;
    }

    private int partition(int start,int end){
        String pivot = this.data[end];
        int i = (start -1);
        for (int j = start;j <= end -1;j++){
            if (this.data[j].compareTo(pivot) < 0){
                i++;
                String t = this.data[i];
                this.data[i] = this.data[j];
                this.data[j] = t;
            }
        }
        String t = this.data[i+1];
        this.data[i+1] = this.data[end];
        this.data[end] = t;
        return (i +1);
    }

    public void quickSort(int start,int end){
        if(start < end){
            int p = partition(start,end);
            quickSort(start, p - 1);
            quickSort(p + 1, end);
        }
    }

    public void printArr(int n){
        int i;
        for (i=0;i<n;i++){
            System.out.println(this.data[i] + " ");
        }
    }
}
