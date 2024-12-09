
public class currentpositioninbinarysearch {

    public static int binarysearch(int a[], int s, int e, int key) {
        if (s <= e) {
            int mid = (s + e) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] > key) {
                return binarysearch(a, s, mid - 1, key);
            } else {
                return binarysearch(a, mid + 1, e, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 5, 7, 8, 9};
        int e = a.length - 1;
        int s = 0;

        int key =60;
        int flag = binarysearch(a, s, e, key);
        if(flag==-1)
        {
            int pos=0;
            // System.out.println("Item is not in array it should be at index "+pos);
            for(int i=0;i<a.length;i++)
            {
                if(a[i]>key)
                {
                    pos=i;
                    break;
                }
                else{
                    pos=a.length;
                }
            }
            System.out.println("Item is not in array it should be at index "+ pos);
            

        }
        else{
            System.out.println(flag);
        }
        

    }

}
