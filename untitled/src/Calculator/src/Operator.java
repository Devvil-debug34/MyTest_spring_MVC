class Operator {

    public String oper (String input){
        if(input.contains("+"))       {
            return "+";
        }
        else if (input.contains("-")) {
            return "-";
        }
        else if (input.contains("*")) {
            return "*";
        }
        else if (input.contains("/")) {
            return "/";
        }
        return null;
    }
}
