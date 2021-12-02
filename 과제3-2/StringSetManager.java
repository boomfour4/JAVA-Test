import java.util.Arrays;
import java.util.*;
enum StringCommand {ADD, SORT, REMOVE , CLEAN , QUIT, INVALID}

public  class StringSetManager {
    static int size = 0;
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] stringSet = new String[100];
        while ( true ) {
            final StringCommand command = getCommand(scanner);
            if ( command == StringCommand.QUIT) {
                System.out.println("BYE!"); break;
            }
            switch ( command ) {
                case ADD: {
                    final String str = getString(scanner);
                    add(stringSet,str);
                    break;
                }
                case SORT: {
                    final String order = getString(scanner);
                    sort(stringSet, order);
                    break;
                }
                case REMOVE: {
                    final String str = getString(scanner);
                    remove(stringSet, str);
                    break;
                }
                case CLEAN: {
                    clean(stringSet);
                    break;
                }
                default: {
                    System.out.println("Invalid");
                    break;
                }
            }
            print(stringSet);
        }
    }
    private static StringCommand getCommand(Scanner scanner){
        String com = scanner.next();
        StringCommand command;
        try{
            command = StringCommand.valueOf(com.toUpperCase());
        }catch(IllegalArgumentException e) {command = StringCommand.INVALID;}
        return command;
    }
    private static String getString(Scanner scanner){
        return scanner.next();
    }
    private static void add(String[] stringSet,String str){
        if(!Arrays.asList(stringSet).contains(str)) {
            stringSet[size] = str;
            size++;
        }
    }
    private static void print(String[] stringSet){
        System.out.print("Element Size: " + size + ", Values = [");
        for(int i = 0; i < size; i++) {
            if(i == 0) System.out.print(stringSet[i]);
            else System.out.print(", " + stringSet[i]);
        }
        System.out.println("]");
    }
    private static void sort(String[] stringSet, String order){
        if(order.toUpperCase().equals(("ASC"))){
            Arrays.sort(stringSet,0, size);
        }
        else if(order.toUpperCase().equals(("DESC"))){
            Arrays.sort(stringSet, 0, size, Collections.reverseOrder());
        }
        else {
            System.out.println("Invalid");
        }
    }
    private static void clean(String[] stringSet){
        for(int i = 0; i < size; i++){
            stringSet[i] = "";
        }
        size = 0;
    }
    private static void remove(String[] stringSet,String str){
        if(Arrays.asList(stringSet).contains(str)) {
            removeElement(stringSet,str);
        }
    }
    private static void removeElement(String[] stringSet,String str){
        String[] tmp = new String[100];
        int i = 0;
        while (!stringSet[i].equals(str)){
            tmp[i] = stringSet[i];
            i++;
        }
        //i th is str;
        for(;i < size - 1; i++) {
            tmp[i] = stringSet [i + 1];
        }
        size--;
        for(i = 0; i < size; i++){
            stringSet[i] = tmp[i];
        }
        stringSet[i]="";

    }

}