import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Vlad on 08.06.2015.
 */

public class Okno extends JFrame {
    public static void GUI (){
        final JFrame frame = new JFrame("Company");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);// благодаря этому окошко будет розмещаться чисто по центру
        frame.setSize(450, 380);


        JPanel butPanel = new JPanel();
        butPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton button1 = new JButton("1. Посмотреть информацию о компании");
        butPanel.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame1 = new JFrame("Информация о компании ");
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.setVisible(true);
                frame1.setSize(550, 150);
                frame1.setLocationRelativeTo(null);
                frame.setVisible(false);
                frame1.setVisible(true);

                JPanel mainPanel = new JPanel(new GridLayout());
                mainPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
                 ArrayList<Company> companyL = new ArrayList<Company>();
                int i=1;
                companyL.add(new Company("Google Ukraine ","Украина, Киев, ул. Металлистов 5","30")) ;
                TableModel model1 = new MyTableModel1(companyL) ;
                JTable table1 = new JTable(model1);
                mainPanel.add(new JScrollPane(table1));


                frame1.getContentPane().add(mainPanel);
            }
        });


        JButton button2 = new JButton("2. Посмотреть сотрудников компании");
        butPanel.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new JFrame("Cписок сотрудников ");
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setSize(700, 300);
                frame.setVisible(false);
                frame2.setVisible(true);
                frame2.setLocationRelativeTo(null);

                JPanel mainPanel = new JPanel(new GridLayout());
                mainPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
                // JLabel label = new JLabel("Введите данные о сотруднике");
                //bel.setLayout(new FlowLayout(FlowLayout.LEADING));
                //mainPanel.add(label);
                ArrayList<Employee> employeeList = new ArrayList<Employee>();

                for(int i=0; i <30; i ++){
                    employeeList.add(new Employee("Имя "+i, "Номер телефона "+i,"Возраст "+i,"Пол "+i,"Адресс "+i));
                }
                TableModel model = new MyTableModel(employeeList);
                JTable table = new JTable(model);
                mainPanel.add(new JScrollPane(table));


                frame2.getContentPane().add(mainPanel);
            }

        });
        JButton button3 = new JButton("3. Посмотреть сотрудников компании, которые работают больше года.");
        butPanel.add(button3);
        JButton button4 = new JButton("4. Вывести список всех сотрудников, которые живут в Киеве и являются девушками");
        butPanel.add(button4);

        JButton button5 = new JButton("5. Добавить сотрудника");
        butPanel.add(button5);



        JButton button6 = new JButton("6. Уволить последнего сотрудника в списке");
        butPanel.add(button6);
        JButton button7 = new JButton("7. Уволить того, зарплата которого меньше 1000 и который работает меньше года");
        butPanel.add(button7);
        JButton button8 = new JButton("8. Изменить данные о сотруднике");
        butPanel.add(button8);
        JButton button9 = new JButton("9. Показать сотрудников: сначала список мужчин, а потом список женщин");
        butPanel.add(button9);
        JButton button10 = new JButton("10. Сотрудник имеет время начала работы");
        butPanel.add(button10);
        JButton button11 = new JButton("11. Посмотреть сотрудников, которые отработали от 100 до 200 часов");
        butPanel.add(button11);




        frame.setContentPane(butPanel);
    }
    public static void main (String[] args){

       GUI();

    }
}
