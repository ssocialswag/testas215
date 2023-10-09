package ua.java.coursework;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.List;

public class Rent {
    JFrame frame = new JFrame(":::ListRent::: General manager - Koziuchko Vyacheslav Vyacheslavovich, Title - RENT market , phone number-0968372901");
    JList<Points> list = new JList<>();
    DefaultListModel<Points> model = new DefaultListModel<>();

    JLabel label = new JLabel();
    JPanel panel = new JPanel();
    JSplitPane splitPane = new JSplitPane();


    public  void makeNoise() {

        list.setModel(model);

        model.addElement(new Points("Nike",new BigDecimal("1.410"),"it's currently rented ---- contract ID-0xe0932x9fds923eac"));
        model.addElement(new Points("Puma", new BigDecimal("1.000"),"it's currently rented ---- contract ID-32fjf9dsf9923d32dd"));
        model.addElement(new Points("Adidas", new BigDecimal("1.230"),"it's currently rented ---- contract ID-ds98aud8s82dad23a"));
        model.addElement(new Points("Crosby", new BigDecimal("1.150"),"it's currently rented ---- contract ID-d8as8da28d8asd2d8a"));

        list.getSelectionModel().addListSelectionListener(e -> {
            Points p = list.getSelectedValue();
            label.setText("Name: " + p.getName() + " ::: "+p.getPrice().toPlainString()+" ::: "+p.getDesc());
        });

        splitPane.setLeftComponent(new JScrollPane(list));
        panel.add(label);
        splitPane.setRightComponent(panel);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(splitPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ListPoint::new);
    }

    private class Points{
        String name;
        BigDecimal price;
        String desc;

        public Points(String name,BigDecimal price,String desc){
            this.name = name;
            this.price = price;
            this.desc = desc;
        }
        public String getName(){

            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public BigDecimal getPrice(){

            return price;
        }
        public void setPrice(BigDecimal price){

            this.price = price;
        }
        public String getDesc(){

            return desc;
        }
        public void setDesc(String desc){

            this.desc = desc;
        }

        @Override
        public String toString(){
            return name;
        }
    }
}