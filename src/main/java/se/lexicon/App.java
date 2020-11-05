package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{

   static String[] names = new String[] {};

    public static void main( String[] args )
    {
        add("Simon Elbrink");
        add("Ulf Bengtsson");
        add("Erik Svensson");

        System.out.println(Arrays.toString(names));

        remove("Ulf Bengtsson");
        System.out.println(Arrays.toString(names));


    }

    public static boolean add(String fullName){

        boolean isAdded = false;

        if (!nameExists(fullName)){
            names = Arrays.copyOf(names, names.length +1);
            names[names.length -1] = fullName;
            isAdded = true;
        }

        return isAdded;
    }

    public static boolean nameExists(String fullName){
        boolean result = false;

        for (int i = 0; i < App.names.length; i++) {
            if (App.names[i].equals(fullName)){
                result = true;
                break;
            }
        }
        return result;
    }


    /**
     *
     * @param fullName
     * @return
     */
    public static boolean remove(String fullName){
        boolean isDeleted = false;

        if (names.length == 0){
            System.out.println("Array is empty");

        }else if(nameExists(fullName)){

            String[] newArray = new String[names.length -1];

            for (int i = 0, j = 0 ; i < names.length; i++, j++){
                if (names[i].equals(fullName)){
                    --j;
                    isDeleted = true;
                }else{
                    newArray[j] = names[i];
                }

            }

            names = newArray;

            return isDeleted;

        }

        return isDeleted;
    }


    public static void clear(){
        if (App.names == null){
            System.out.println("Name list is not initialized, but now created.");
        }else{
            System.out.println("Name list had been emptied!");
        }

        App.names = new String[0];
    }


}
