
public class FileValidatorTester
{   
    public static void testValidFilenameMethod()
    {
        System.out.println("For this tester to work, your class MUST be named FileValidator");
        System.out.println("and you must have a static method named validFileName with the");
        System.out.println("following signature:\n\tpublic static String validFileName(String str)");

        int score = 0;
        int max = 0;

        if (isCorrect("1STFILE.TXT","1STFILE.TXT"))
            score++;
        max++;

        if (isCorrect("foo","FOO.TXT"))
            score++;
        max++;

        if (isCorrect("invalidfilename",null))
            score++;
        max++;

        if (isCorrect("rEadMe","README.TXT"))
            score++;
        max++;

        if (isCorrect("PNTLESS.","PNTLESS"))
            score++;
        max++;

        if (isCorrect("fun_pict.ico","FUN_PICT.ICO"))
            score++;
        max++;

        if (isCorrect("ms*.exe",null))
            score++;
        max++;

        if (isCorrect("w?t\\*:",null))
            score++;
        max++;

        if (isCorrect("FuNFile.1","FUNFILE.1"))
            score++;
        max++;

        if (isCorrect("x.co","X.CO"))
            score++;
        max++;

        if (isCorrect("bad.file.n",null)) 
            score++;
        max++;

        System.out.println("\nYour score: " + score + "/" + max);

    }

    private static boolean isCorrect(String input, String correctResponse)
    {
        System.out.println("\nInput: \t\t\t" + input);
        String userResponse = FileValidator.validFileName(input);
        System.out.println("Your method returned: \t" + userResponse);
        System.out.println("Correct response is:  \t" + correctResponse);
        if ((userResponse==null && correctResponse==null) || (correctResponse!=null && correctResponse.equals(userResponse)))
            System.out.println("CORRECT!");
        else
            System.out.println("INCORRECT.");

        return (userResponse==null && correctResponse==null) || (userResponse!=null && userResponse.equals(correctResponse));
    }
}