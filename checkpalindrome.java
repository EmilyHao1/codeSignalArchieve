boolean checkPalindrome(String inputString) {
    String reversedString = new StringBuffer(inputString).reverse().toString();
    if(inputString.equals(reversedString)){
        return true;
    }else{
        return false; 
    }
}
