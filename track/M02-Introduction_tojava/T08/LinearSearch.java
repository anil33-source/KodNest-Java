class LinearSearch {
    void search(int ref[],int val){
        boolean found=false;
        for(int i=0;i<ref.length;i++){
        if(ref[i]==val){
            found=true;
            System.out.println("Element found at index: " + i);
        }
    }
    if(!found){
        System.out.println("Not found");
    }
    }
}
