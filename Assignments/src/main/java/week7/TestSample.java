package week7;

/**
 * Date: 06.01.14
 * Time: 09:21
 */
public class TestSample {

    public static void main(String[] args) {
        String one = "ATCTCCGTCCGTAAAGCTCGCGAGAGGCTGGCCTAAGTCGCAGTGGGGATATTCGCTCGTCTGGTCTAATAGTCCAAATGCAACTAAAATGCTAACTATTTCTTTGCTCGAGGCATATTATTAAGGCGCTAGGGTATGTGAATTTTTGAAGCCTCCCGAACAGTCGTACAGTAGACCCCCACCAAGGCTGTCTGAGGCCGAGAAATACCAATCGTATAACTGTTCAGAACGCTTACTGGTTGTGCGTTTTCCGCGGTACGATCTGCAGCCGCTTCCCTTCGACCAATTCCCTAGCTCGTTACCCCACGCGACGCCTCGCGGTTCTTTGCAAGGATACAGGTCCGGGCTTCGACTGCTGGAACGACGAGACCTAAGCCCATAGCTCTAACAGAATTACAACTGCAATATCCGACCGGACTGAGATCATACGGTCGATTTGTTCAGATTCAGGCGTATCACCGAAGTGGGGTACCTTCTGTAAGCTGCAACCATACCCGGCTAAGGAGAGCGTAGCATCTACATAAACGAGGTTGCGACGATCAGCAGAATATCGATTACGGAAGTTGTCGCCTTTGTTCCGCCTTTCCCTTTGACCAGGTCTCTCCGTCGCCCAGAAGCCCTGCAAAACCGGGGCGCTTGTATCTGCCCGTGTCGACTGAACAAGGGCCATAGCTCAAGTGGCATACCATCAGTTATGGATCCACATCAAGTGGCAGGATCAATTGGAGGTTGCATCAGCAAACGCTACCACAAAGCAGTGTGGGCAAAGCGATCACCTAAATGCTTAGGCATGTATGTCCAACTAACTAAAAGGTGACCTTCAACACATCAAGAATTAGCTTGAAACCGAAAAGAATATTCGGGGGAGCTTCCCGAGCCTGACCGATGCGGGCTACACACGT";
        String two = "TGACCGTTCACTGAAATAGGGTCGCATAACTCAGGTGAAATACACATTGGGATCCACCATCAAGTGGTCAGGACCATGATTTCGGAGGTCACCCAGACAAACACTATCCACAGAGTAGGGGCAAAGCCATCGTCTATAGCTTAGCACCTGTAGCCACATAACGAAAGTGCCTTATCACATCAAGGCCATTGGCTTCAAACCAGAGAAGATTACTCGTGACAGCTTTACGGGCCATGACAGATATAGCATAAGACATGCTAATCTTGAAGCATACCAGTACGAAATCGGTCGGAGGACGTCATGTCTCTCCGCCTTAGCGACCGAAAGAAAAGTCTTCTGTAACACAAACAGGGGCCTGGTTCCTCACAGGGTGTCGTACCCTTGCCGTCAATAAGCTACTGTGCGGGGCCTTACATTTCTATATATAAGAACGCAATCAGTAGAGCAGATTAGCGGTGGCTTCAACCCTTCTCACAACGGACCCCTTGCTGTGCATGTCCACCGCAACAAAGCGATTAAGACCAGACATAAGTCGCATTTCGTGTTACCAAGAACCAGCATCGCCGGATCTCGTAGTAATCACGTCTCGATTTGGTACATATAGTGCCCAGACGCATGACGTACTTGGTTCGCTTCTGATTACATGTAGGGTCGCAGAACTTCGGCGCCACGTTCGACGGCGCTATGCACCCTGAAGTGAATTAAGATTGGGAGCCACGCTTGGCGCAAATTCGGTATCTAGTAGGCATGTTAATTTAGATCCCATGCCCCCCATGTCGGGTAACTCATAAAACTTGGCTAACATTATGGTCTTGTCAAACTAAGCAAGGGAATGTACGTGACTTTCACGGCACTGTACATACTTTTGCACGACCGGGTTAGTGTCCTGGAGGTCGCCCGCGAGCGACGGTT";
        OverlapAlignment overlapAlignment = new OverlapAlignment(one, two, -2);
        overlapAlignment.createGlobalAlignment();
    }

}
