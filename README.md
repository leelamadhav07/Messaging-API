# 📩 Messaging API - Spring Boot Backend

I developed a full-stack application that enables **admins** to send messages **only to the phone numbers of users registered in Twilio**.  
Admins cannot check if the user has opened/read the message.  
Supports **delivery status tracking** (sent, delivered) and real-time **SMS notifications** via Twilio.  

---

## 🚀 Features
- 👤 Admins can send SMS messages to registered Twilio users  
- 📊 Message delivery status: **Sent / Delivered**  
- 📱 SMS notifications powered by **Twilio API**  
- 🧑‍💻 User-based message retrieval  
- 🧪 API testing support via **Postman**  

---

## 🛠️ Tech Stack
- **Frontend:** HTML, CSS, JS
- **Backend:** Java, Spring Boot  
- **SMS Integration:** Twilio API  
- **Build Tool:** Maven  
- **Testing Tool:** Postman  
---

## 📂 Project Structure
```
📂 Messaging-API/  
│  
├── src/main/java/com/messaging/  
│   ├── controller/  
│   │   └── SmsController.java          # Handles REST API requests  
│   ├── model/  
│   │   └── SmsRequest.java             # Request payload for SMS  
│   ├── service/  
│   │   └── TwilioSmsService.java       # Business logic, Twilio integration  
│   └── SpringSmsSenderApplication.java # Main Spring Boot entry point  
│  
├── src/main/resources/  
│   ├── static/  
│   │   └── index.html                  # Frontend entry point  
│   └── application.properties          # Twilio credentials & config  
│  
└── pom.xml                             # Maven dependencies  
```
---

## ⚙️ Installation & Setup

1. **Clone the repository**
   ```
   git clone https://github.com/leelamadhav07/Messaging-API.git
   cd Messaging-API
   ```
2. **Set up Twilio credentials**
Add your Twilio SID, Auth Token, and Twilio Phone Number in **application.properties**:
```
twilio.account.sid=your-twilio-sid
twilio.auth.token=your-twilio-auth-token
twilio.phone.number=+1234567890
```

3. **Run the Application**
```
mvn spring-boot:run
```

Backend will start at 👉 ```http://localhost:8080```
Frontend (served from static/index.html) will be available at 👉
```http://localhost:8080/index.html```

4. **Using the Application**

Open the frontend in your browser at ```http://localhost:8080/index.html```

Use the UI to send SMS messages to registered Twilio users

Message delivery status (sent, delivered) is tracked in real time

5. **Alternative:** **Test APIs using Postman**

Send SMS → **POST /api/sms/send**

Provide request body:
```
{
  "to": "+91xxxxxxxxxx",
  "message": "Hello from Messaging API!"
}
```
## 🌟 Future Enhancements

📩 Add email notifications (via SendGrid or SMTP)

📊 Store message history in persistent DB (MySQL/PostgreSQL)

📱 Add multi-user roles (Super Admin, Admin, User)

☁️ Deploy on cloud (AWS / Google Cloud / Heroku)

## 🤝 Contribution

Contributions are welcome! Follow these steps:

1. **Fork this repository**

2. **Create your feature branch**
```
git checkout -b feature-name
```

3. **Commit your changes**
```
git commit -m "Added new feature"
```

4. **Push to your branch**
```
git push origin feature-name
```

5. **Open a Pull Request**

## 📜 License

This project is licensed under the MIT License.

## 👨‍💻 Author

Developed by S. Leela Madhav ✨
If you like this project, consider giving it a ⭐ on GitHub!


