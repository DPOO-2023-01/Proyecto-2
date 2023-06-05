package Interfaz;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import mundo.Biblioteca;
import mundo.Servicio;


public class dualChart2 extends JFrame {

    JFreeChart chart;
    ArrayList<Servicio> Servicios;
    
    public dualChart2() {
        super("Unidades existentes frente a ventas");
        setSize(800, 600);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Biblioteca biblioteca = new Biblioteca(); 
        Servicios = biblioteca.getServicios(); 
        
        crearGrafico();

        ChartPanel panel = new ChartPanel(chart, false);
        panel.setBounds(10, 20, 760, 520);
        add(panel);

        setVisible(true);
    }
    
    public void crearGrafico() {
        DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
        
        for (int i = 0;i < Servicios.size(); i++) {
			Servicio temp = (Servicio) Servicios.get(i);
            dataset1.setValue(temp.getCantidad(), "Cantidad", temp.getID());
        }
        
        
        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
        
        for (int i = 0;i < Servicios.size(); i++) {
			Servicio temp = (Servicio) Servicios.get(i);
            dataset2.setValue(temp.getVentas(), "Ventas", temp.getID());
        }
        
        chart = ChartFactory.createBarChart3D(
                "Unidades existentes frente a ventas", // chart title
                "Productos", // domain axis label
                "Unidades existentes", // range axis label
                dataset1, // data
                PlotOrientation.VERTICAL,
                true, // include legend
                true,
                false
        );
                
        ValueAxis axis2 = new NumberAxis3D("Ventas");
        
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setRangeAxis(1, axis2);
        plot.setDataset(1, dataset2);
        plot.mapDatasetToRangeAxis(1, 1);
        
        CategoryItemRenderer renderer2 = new LineAndShapeRenderer();
        renderer2.setSeriesPaint(0, Color.red);
        plot.setRenderer(1, renderer2);
    }
    
    public static void main(String[] args) {
    	dualChart2 demo = new dualChart2();
    }
    
}
