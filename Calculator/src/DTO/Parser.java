package DTO;

public interface Parser {

    static Request parse(String input) {
        Request request = null;
        try {
            String[] splitted = input.split(" ");
            char operation = splitted[1].charAt(0);
            int first = Integer.parseInt(splitted[0]);
            int second = Integer.parseInt(splitted[2]);
            request = new Request(first, second, operation);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("""
                    Write an equation with spaces eg. "2 + 5"     """);
        } catch (NumberFormatException e) {
            System.err.println("""
                    Insert numbers: "2 + 5"     """);
        }
        return request;
    }

}
