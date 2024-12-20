package Java_DSA.LargeData;

import java.util.Random;

public class RandomString {
    static String generateString(int length) {
        StringBuffer sb = new StringBuffer(length);
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            int randChar = 97 + (int) (rand.nextFloat()*26);// not using rand.nextInt(26) makes it more random
            sb.append((char) randChar);
        }

        return sb.toString();
    }
}
