/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import model.koneksidb;
import java.sql.Connection;


/**
 *
 * @author muham
 */
public class SendEmail {
    String id_barang,id_laboran,id_member,id_peminjaman,tgl_peminjaman,nama_barang
            ,nama_laboran,nama_member,email,lama_peminjaman;
    koneksidb datacon = new koneksidb();
    private Connection con;
    //String email;
    
    public SendEmail(String id_barang, String id_laboran, String id_member){
        this.id_barang=id_barang;
        this.id_laboran=id_laboran;
        this.id_member=id_member;
    }
    
    public void loadmember(){
        try {
            //int no=1;
            String sql = "SELECT * "
                    + "from peminjaman JOIN barang on peminjaman.id_barang = barang.id_barang "
                    + "JOIN laboran on peminjaman.id_laboran=laboran.id_laboran "
                    + "JOIN member on peminjaman.id_member=member.id_member "
                    + "where member.id_member='"+this.id_member+"' "
                    + "and barang.id_barang='"+this.id_barang+"'"
                    + "and laboran.id_laboran='"+this.id_laboran+"';";
            //java.sql.Connection conn=(Connection)config.configDB();
            con = datacon.getConnection();
            java.sql.Statement stm=con.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                this.id_peminjaman=res.getString(1);
                this.tgl_peminjaman=res.getString(5);
                this.nama_barang=res.getString(12);
                this.nama_laboran=res.getString(18);
                this.nama_member=res.getString(24);
                this.email = res.getString(29);
                this.lama_peminjaman= res.getString(6);
                //System.out.println(id_peminjaman+tgl_peminjaman+nama_barang);
            }
            
        } catch (Exception e) {
        }
    }
    
    public void kirimEmail(){
                final String username = "laboranitera@gmail.com";
		final String password = "laboranitera123";
                
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
                
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("muhamadenrinal@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(email));
			message.setSubject("Invoice Peminjaman "+id_peminjaman);
			message.setText("Dear ,"+nama_member
				+ "\n\n Dibawah Ini adalah detail peminjaman anda!"+
                                "\n ID Barang : "+id_barang+
                                "\n Nama Barang :"+nama_barang+
                                "\n ID Laboran : "+id_laboran+
                                "\n Nama Laboran :"+nama_laboran+
                                "\n Tanggal Peminjaman :"+tgl_peminjaman+
                                "\n Lama Peminjaman :"+lama_peminjaman);

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
    }
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//public class TestEmail {
//
//	public static void main(String[] args) {
//
//		final String username = "muhamadenrinal@gmail.com";
//		final String password = "Muhammad2&";
//
//		Properties props = new Properties();
//		props.put("mail.smtp.auth", "true");
//		props.put("mail.smtp.starttls.enable", "true");
//		props.put("mail.smtp.host", "smtp.gmail.com");
//		props.put("mail.smtp.port", "587");
//
//		Session session = Session.getInstance(props,
//		  new javax.mail.Authenticator() {
//			protected PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication(username, password);
//			}
//		  });
//
//		try {
//
//			Message message = new MimeMessage(session);
//			message.setFrom(new InternetAddress("muhamadenrinal@gmail.com"));
//			message.setRecipients(Message.RecipientType.TO,
//				InternetAddress.parse("enrinalkaskus@gmail.com"));
//			message.setSubject("Testing Subject");
//			message.setText("Dear Mail Crawler,"
//				+ "\n\n No spam to my email, please!");
//
//			Transport.send(message);
//
//			System.out.println("Done");
//
//		} catch (MessagingException e) {
//			throw new RuntimeException(e);
//		}
//	}
//}
