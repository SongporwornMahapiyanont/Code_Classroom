package ConsecDupRemoval;
class dupRemove {
    dupRemove(){
        
    }
    String Word(String str){
        if(str.length()<=1)
        {
            return str;
        }
        if(str.charAt(0)==str.charAt(1))
        {
            return Word(str.substring(1));
        }
        return str.charAt(0) + Word(str.substring(1)); 
    }
}
