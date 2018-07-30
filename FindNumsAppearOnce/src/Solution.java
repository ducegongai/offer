//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array == null||array.length<2)
            return ;
            int tmp = 0;
            for (int i = 0; i < array.length; i++)
                tmp = tmp^array[i];
            int indexOf1 = findFirstBit1s(tmp);
            for (int i = 0; i <array.length ; i++) {
                if(isBit(array[i],indexOf1))
                    num1[0] = num1[0]^array[i];
                else
                    num2[0] = num2[0] ^array[i];
            }

    }
    public int findFirstBit1s(int num){
        int indexBit = 0;
        while(((num&1)==0)&&(indexBit<Integer.SIZE)){
            num = num>>1;
            ++indexBit;
        }
        return indexBit;
    }
    public boolean isBit(int num,int indexBit){
        num = num>>indexBit;
        return (num & 1)==1;
    }
}