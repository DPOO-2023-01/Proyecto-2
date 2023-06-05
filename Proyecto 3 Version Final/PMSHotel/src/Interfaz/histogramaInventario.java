package Interfaz;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import mundo.Biblioteca;
import mundo.Servicio;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GradientPaint;
import java.util.ArrayList;

public class histogramaInventario extends JFrame {

    JFreeChart chart;
    ArrayList<Servicio> Servicios;

    public histogramaInventario() {
        super("Productos Existentes");
        setSize(800, 600);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Biblioteca biblioteca = new Biblioteca(); 
        Servicios = biblioteca.getServicios(); 
        
        crearGrafico(Servicios);

        ChartPanel panel = new ChartPanel(chart, false);
        panel.setBounds(10, 20, 760, 520);
        add(panel);

        setVisible(true);
    }

    public void crearGrafico(ArrayList<Servicio> Servicios) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int i = 0;i < Servicios.size(); i++) {
			Servicio temp = (Servicio) Servicios.get(i);
            dataset.setValue(temp.getCantidad(), "Cantidad", temp.getID());
        }

        chart = ChartFactory.createBarChart3D(
                "Productos Existentes", //Nombre de la grafica
                "Producto", //Nombre del eje Horizontal
                "Cantidad Existente", //Nombre del eje vertical
                dataset, //Data
                PlotOrientation.VERTICAL, //Orientacion HORIZONTAL o VERTICAL
                true, //Incluir leyenda
                true, //Informacion al pasar el mouse
                true);                      //URls

        chart.setBackgroundPaint(Color.GRAY);//Dar color al fondo del panel
        chart.getTitle().setPaint(Color.WHITE);//Dar color al titulo 
            	    	    
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.WHITE);//Color del fondo del gr�fico

        plot.setDomainGridlinesVisible(true);//Lineas divisorias
        plot.setRangeGridlinePaint(Color.BLACK);//Color de lineas divisorias	    

        //Calculo de los valores en el eje x
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(true);//Asignar color de linea a las barras

        //Dar color a las barras
        GradientPaint gp = new GradientPaint(0.0f, 0.0f, Color.green, 0.0f, 0.0f, new Color(0, 64, 0));
        renderer.setSeriesPaint(0, gp);

        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0));

    }

    public static void main(String args[]) {
        histogramaInventario demo = new histogramaInventario();
        
    }
}
