
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM dorowu/ubuntu-desktop-lxde-vnc

COPY target/Cajero-1.0-SNAPSHOT-jar-with-dependencies.jar /home/usuario/Cajero.jar
COPY start.sh /home/usuario/start.sh
RUN chmod +x /home/usuario/start.sh

CMD ["/home/usuario/start.sh"]


