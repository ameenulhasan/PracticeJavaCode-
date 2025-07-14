package com.ameen.practice.code;

public class count2 {

        public static void main(String[] args) {

            String input = "a4utg2c1";
            StringBuilder output = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (Character.isDigit(ch)) {
                    int repeat = Character.getNumericValue(ch);
                    char prevChar = output.charAt(output.length() - 1);

                    for (int j = 1; j < repeat; j++) {
                        output.append(prevChar);
                    }
                } else {

                    output.append(ch);
                }
            }

            System.out.println(output.toString());
        }
}

