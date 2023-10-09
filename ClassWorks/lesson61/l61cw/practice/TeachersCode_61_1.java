package practice;

public class TeachersCode_61_1 {
    public static void main(String[] args) throws InterruptedException {

        // thread1
        int x = 10; // исходное

        int y = 12; // новое значение, которое хотим записать в х
        int temp = x; // значение для сопастовления

        // эта проверка нужна потому что х мог измениться в другом потоке
        if (temp == x) {
            x = y;
        }


        // thread2, который еще не знает, что значение было изменено в thread1
        // и пытается заменить значение х (думает, что все еще 10) на 30.
        y = 30;

        // не получится, так как к этому моенту х уже равен 12 (изменен в thread1), а temp
        // все еще равен 10 (предыдущее значение, которое успел записать thread2)
        if(temp == x) {
            x = y;
        }

    }




    static void ABAexm() {
        Thread t1 = null;
        Thread t2 = null;

        int x = 5;  // исходное значение, равно 5
        int temp1, temp2; // temp1, temp2 - временные переменные для хренения значения, используемая в CAS для t1 и t2
        int tempCount1, tempCount2; // tempCount1, tempCount2 - временные переменные для хренения значения count,
        // используемая в CAS для t1 и t2
        int y1, y2 ; // y - хранит новое значение, которое мы пытаемся записать в х
        int count = 0;

        // t1 пытается изменить х при помощи CAS:
        temp1 = x;
        tempCount1 = count;
        y1 = 12;

        if (x == temp1 && tempCount1 == count) {
            x = y1;
            count++;
        }


        // t2  - начинает работать одновременно с t1, но работает медленней:
        // к тому моменту, когда t1 уже закончил, t2 только успел записать исходное значение х (5)
        temp2 = x; // в этот момент все еще х = 5
        tempCount2 = count; // в этот момент все еще count = 0
        y2 = 45;

        // но поток t1 на столько быстрый, что пока поток t2 успел выполнить лишь первую строку (стр 53), поток t1 уже
        // начал второй раз менять переменную х, который на данный момент равен 12 (см первое изменение при помощи
        // потока t1)
        temp1 = x; // 12
        tempCount1 = count; // уже равно 1
        y1 = 5;

        // все верно, проверку прошли, двигаемся дальше
        if (x == temp1 && tempCount1 == count) {
            x = y1; // х равен снова 5
            count++;
        }

        // поток t2 наконец добрался к этому моменту к операции CAS и начинает сравнивать дважды измененный х
        // двигаемся по аналогичной логике CAS
        if (x == temp2 && tempCount2 == count) { // temp2 равен исходному значению х, которое никто не менял,
            // но tempCount2 = 0, а count в этот момент уже равен 2, следовательно неверно записывать значения в эту
            // переменную, тк возникнет гонка ресурсов
            x = y2; // x равен 5, значение которое он приобрел, во втором изменении при помощи потока t1
            count++;
        }


    }
}
