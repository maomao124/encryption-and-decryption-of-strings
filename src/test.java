import java.util.Scanner;

/**
 * Project name(项目名称)：字符串的加密解密 encryption-and-decryption-of-strings
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/1
 * Time(创建时间)： 19:58
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static String encryptAndDencrypt(String value, char secret)
    {
        byte[] bt = value.getBytes(); // 将需要加密的内容转换为字节数组
        for (int i = 0; i < bt.length; i++)
        {
            if (i % 2 == 1)
            {
                bt[i] = (byte) (bt[i] ^ (5 + i + (int) secret)); // 通过异或运算进行加密
            }
            else
            {
                bt[i] = (byte) (bt[i] ^ (2 + 2 * i + (int) secret));
            }
        }
        String newresult = new String(bt, 0, bt.length); // 将加密后的字符串保存到 newresult 变量中
        return newresult;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char secret = '1'; // 加密文字符
        System.out.println("请输入您想加密的内容：");
        String pass = scan.next();
        System.out.println("原字符串内容：" + pass);
        String encryptResult = encryptAndDencrypt(pass, secret);
        System.out.println("加密后的内容：" + encryptResult);
        String uncryptResult = encryptAndDencrypt(encryptResult, secret);
        System.out.println("解密后的内容：" + uncryptResult);
    }
}
