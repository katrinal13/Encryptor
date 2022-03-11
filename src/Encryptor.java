import java.io.*;

public class Encryptor {
    /**
     * A two-dimensional array of single-character strings, instantiated in the constructor
     */
    private String[][] letterBlock;

    /**
     * The number of rows of letterBlock, set by the constructor
     */
    private int numRows;

    /**
     * The number of columns of letterBlock, set by the constructor
     */
    private int numCols;

    /**
     * Constructor
     */
    public Encryptor(int r, int c) {
        letterBlock = new String[r][c];
        numRows = r;
        numCols = c;
    }

    public String[][] getLetterBlock() {
        return letterBlock;
    }

    /**
     * Places a string into letterBlock in row-major order.
     *
     * @param str the string to be processed
     *            <p>
     *            Postcondition:
     *            if str.length() < numRows * numCols, "A" in each unfilled cell
     *            if str.length() > numRows * numCols, trailing characters are ignored
     */
    public void fillBlock(String str) {
        int k = 0;
        for (int row = 0; row < letterBlock.length; row++) {
            for (int col = 0; col < letterBlock[0].length; col++) {
                if (k > str.length() - 1) {
                    letterBlock[row][col] = "A";
                } else {
                    letterBlock[row][col] = str.substring(k, k + 1);
                    k++;
                }
            }
        }
    }

    /**
     * Extracts encrypted string from letterBlock in column-major order.
     * <p>
     * Precondition: letterBlock has been filled
     *
     * @return the encrypted string from letterBlock
     */
    public String encryptBlock() {
        String encryptBlock = "";
        for (int col = 0; col < letterBlock[0].length; col++) {
            for (int row = 0; row < letterBlock.length; row++) {
                encryptBlock += letterBlock[row][col];
            }
        }
        return encryptBlock;
    }

    /**
     * Encrypts a message.
     *
     * @param message the string to be encrypted
     * @return the encrypted message; if message is the empty string, returns the empty string
     */
    public String encryptMessage(String message) {
        String encryptMessage = "";
        int length = message.length();
        for (int i = 0; i < message.length(); i += (numRows * numCols)) {
            if (i + (numRows * numCols) > message.length()) {
                fillBlock(message.substring(i, message.length()));
            } else {
                fillBlock(message.substring(i, i + (numRows * numCols)));
            }
            encryptMessage += encryptBlock();
        }
        return encryptMessage;
    }

    /**
     * Decrypts an encrypted message. All filler 'A's that may have been
     * added during encryption will be removed, so this assumes that the
     * original message (BEFORE it was encrypted) did NOT end in a capital A!
     * <p>
     * NOTE! When you are decrypting an encrypted message,
     * be sure that you have initialized your Encryptor object
     * with the same row/column used to encrypted the message! (i.e.
     * the “encryption key” that is necessary for successful decryption)
     * This is outlined in the precondition below.
     * <p>
     * Precondition: the Encryptor object being used for decryption has been
     * initialized with the same number of rows and columns
     * as was used for the Encryptor object used for encryption.
     *
     * @param encryptedMessage the encrypted message to decrypt
     * @return the decrypted, original message (which had been encrypted)
     * <p>
     * TIP: You are encouraged to create other helper methods as you see fit
     * (e.g. a method to decrypt each section of the decrypted message,
     * similar to how encryptBlock was used)
     */
    public String decryptMessage(String encryptedMessage) {
        String decryptMessage = "";
        for (int i = 0; i < encryptedMessage.length(); i += (numRows * numCols)) {
            String encryptPart = encryptedMessage.substring(i, i + (numRows * numCols));
            String[][] decryptBlock = new String[numRows][numCols];
            int j = 0;
            for (int col = 0; col < decryptBlock[0].length; col++) {
                for (int row = 0; row < decryptBlock.length; row++) {
                    decryptBlock[row][col] = encryptPart.substring(j, j + 1);
                    j++;
                }
            }

            for (int row = 0; row < decryptBlock.length; row++) {
                for (int col = 0; col < decryptBlock[0].length; col++) {
                    if (decryptBlock[row][col].equals("A")) {
                        if (col + 1 < decryptBlock[0].length) {
                            if (!decryptBlock[row][col + 1].equals("A")) {
                                decryptMessage += decryptBlock[row][col];
                            }
                        }
                    } else {
                        decryptMessage += decryptBlock[row][col];
                    }
                }
            }
        }
        return decryptMessage;
    }

    public String superEncryptMessage(String message)
    {
        String encryptMessage = "";
        int length = message.length();
        for (int i = 0; i < message.length(); i += (numRows * numCols))
        {
            if (i + (numRows * numCols) > message.length())
            {
                fillBlock(message.substring(i, message.length()));
            }
            else
            {
                fillBlock(message.substring(i, i + (numRows * numCols)));
            }

            // Shifts rows down by 1
            String[] temp = letterBlock[letterBlock.length - 1];
            for (int row = letterBlock.length - 1; row > 0; row--)
            {
                letterBlock[row] = letterBlock[row - 1];
            }
            letterBlock[0] = temp;

            //Shifts columns to the left by 1
            String[] tempCol = new String[letterBlock.length];
            for (int t = 0; t < letterBlock.length; t++)
            {
                tempCol[t] = letterBlock[t][0];
            }

            for (int row = 0; row < letterBlock.length; row++)
            {
                for (int col = 1; col < letterBlock[0].length; col++)
                {
                    letterBlock[row][col - 1] = letterBlock[row][col];
                }
            }

            int r = 0;
            for (int t = 0; t < tempCol.length; t++)
            {
                letterBlock[r][letterBlock[0].length - 1] = tempCol[t];
                r++;
            }

            encryptMessage += encryptBlock();
        }
        return encryptMessage;
    }

    public String superDecryptMessage(String message)
    {
        String decryptMessage = "";
        for (int i = 0; i < message.length(); i += (numRows * numCols)) {
            String encryptPart = message.substring(i, i + (numRows * numCols));
            String[][] decryptBlock = new String[numRows][numCols];
            int j = 0;
            for (int col = 0; col < decryptBlock[0].length; col++) {
                for (int row = 0; row < decryptBlock.length; row++) {
                    decryptBlock[row][col] = encryptPart.substring(j, j + 1);
                    j++;
                }
            }

            // Shifts rows up by 1
            String[] temp = decryptBlock[0];
            for (int row = 1; row < decryptBlock.length; row++)
            {
                decryptBlock[row - 1] = decryptBlock[row];
            }
            decryptBlock[decryptBlock.length - 1] = temp;

            // Shifts columns right by 1
            String[] tempCol = new String[decryptBlock.length];
            for (int t = 0; t < decryptBlock.length; t++)
            {
                tempCol[t] = decryptBlock[t][decryptBlock[0].length - 1];
            }

            for (int row = 0; row < decryptBlock.length; row++)
            {
                for (int col = decryptBlock[0].length - 2; col >= 0; col--)
                {
                    decryptBlock[row][col + 1] = decryptBlock[row][col];
                }
            }

            int r = 0;
            for (int t = 0; t < tempCol.length; t++)
            {
                decryptBlock[r][0] = tempCol[t];
                r++;
            }

            for (int row = 0; row < decryptBlock.length; row++) {
                for (int col = 0; col < decryptBlock[0].length; col++) {
                    if (decryptBlock[row][col].equals("A")) {
                        if (col + 1 < decryptBlock[0].length) {
                            if (!decryptBlock[row][col + 1].equals("A")) {
                                decryptMessage += decryptBlock[row][col];
                            }
                        }
                    } else {
                        decryptMessage += decryptBlock[row][col];
                    }
                }
            }
        }
        return decryptMessage;
    }
}