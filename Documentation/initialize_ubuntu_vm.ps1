#---------------------------- INICIAR LA MÁQUINA VIRTUAL ----------------------------
# Ruta del VBoxManage
$VBoxManage = "C:\Program Files\Oracle\VirtualBox\VBoxManage.exe"

#---------OBTENER EL NOMBRE DE LA MÁQUINA VIRTUAL QUE QUEREMOS INICIAR----------------
# Usamos el siguiente comando para obtener la lista de todas las máquinas virtuales con su nombre y UUID: "vm_name {vm_UUID}"
#Luego, guardamos en una variable su nombre para usarlo en este script
$machine = "Ubuntu_Server_24"
#-------------------------------------------------------------------------------------

#-----------------COMANDO PARA INICIAR LA MÁQUINA VIRTUAL SIN INTERFAZ GRÁFICA---------
&"$VBoxManage" startvm "$machine" --type headless
#-------------------------------------------------------------------------------------

#--------------------------- CONFIGURAR SSH PARA NO INTRODUCIR CONTRASEÑA ------------
# El objetivo de este script es automatizar el proceso de abrir VirtualBox,
# seleccionar la VM, iniciarla y luego abrir ConEmu para conectarnos vía SSH automáticamente
# (sin tener que ingresar la contraseña del usuario ubuntu).
#
# Para ello, debemos copiarla llave pública SSH de Windows y agregarla en Ubuntu como clave autorizada.
#
#  --- VALIDAMOS SI TENEMOS LAS LLAVES SSH GENERADAS ---
#
#      1) validamos si tenemos la carpeta .shh usando el comando en powershell: Test-Path $env:USERPROFILE\.ssh  esto nos retornara true o false.
#      2) si existe la carpeta, listamos los archivos dentro de .ssh con el comando Get-ChildItem $env:USERPROFILE\.ssh la llave publica tendra el .pub al final
#
#  --- GENERAMOS LAS LLAVES SSH (SI NO LAS TENEMOS) ---
#
#     si no tenemos llaves, o al hacer la verificacion de la carpeta .ssh retorna false, tendremos que hacer lo siguiente: ssh-keygen -t ed25519 -C "tu_email@ejemplo.com"
#
#    ssh-keygen: programa para generar claves SSH.
#    -t ed25519: tipo de clave (moderna, segura y recomendada).
#    -C tu_email@ejemplo.com": comentario para identificar la clave (podemos poner nuestro correo o cualquier texto).
#
#  --- COPIAMOS LA LLAVE PUBLICA DE WINDOWS EN UBUNTU COMO CLAVE AUTORIZADA ---
#
#  Get-Content $env:USERPROFILE\.ssh\id_ed25519.pub | ssh -p 2222 ubuntu@localhost 'mkdir -p ~/.ssh && cat >> ~/.ssh/authorized_keys && chmod 700 ~/.ssh && chmod 600 ~/.ssh/authorized_keys'
#
#-------------------------------------------------------------------------------------

#--------------------------- CONECTAR A LA VM DESDE CONEMU USANDO SSH -----------------
# Ruta del ejecutable de ConEmu
$conemu = "C:\Program Files\ConEmu\ConEmu64.exe"

# IP de la máquina virtual (en este caso localhost)
$vmIP = "localhost"

# Usuario para SSH
$sshUser = "ubuntu"

# Comando que abrirá ConEmu y conectará vía SSH a la VM
Start-Process -FilePath $conemu -ArgumentList @("-run", "ssh -p2222 $sshUser@$vmIP")
#-------------------------------------------------------------------------------------

#---------------------------- PARA APAGAR LA MÁQUINA VIRTUAL --------------------------
# La VM se debe apagar manualmente con este comando en PowerShell:
#
# "C:\Program Files\Oracle\VirtualBox\VBoxManage.exe" controlvm Ubuntu_Server_24 acpipowerbutton
#
# Para que este comando funcione, es necesario tener instalado el servicio de gestión de energía (acpid) en Linux.
# verificamos con sudo acpid --version, si no esta la instalamos con:
# sudo apt update
# sudo apt install acpid
# sudo systemctl enable acpid
# sudo systemctl start acpid
#-------------------------------------------------------------------------------------

#CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC
#---------------------------- Start the VM ----------------------------
# VBoxManage's path
#$VBoxManage = "C:\Program Files\Oracle\VirtualBox\VBoxManage.exe"

#---------GET THE NAME OF THE VM THAT WE WANT TO START---------------------------
#we use the next command to get a list of all the vms we have "vm_name {vm_UUID}"
#$machine = "Ubuntu_Server_24"
#--------------------------------------------------------------------------------

#-----------------COMMAND TO START THE VM WITHOUT GUI--------------
#&"$VBoxManage" startvm "$machine" --type headless
#---------------------------------------------------------------------

#--------------------------- CONFIGURE SSH TO SKIP PUT THE PASSWORD -----------
# As the goal of this script is to automate the process of open the virtualbox,
# select the vm, start it and then open conemu and connet by ssh autmatically (without put the #ubunt's user password), we have to create/generate the ssh public key in windows in order to set it #in ubuntu as authorized key
#
#type $env:USERPROFILE\.ssh\id_ed25519.pub | ssh -p 2222 ubuntu@localhost "mkdir -p ~/.ssh && cat >> #~/.ssh/authorized_keys && chmod 600 ~/.ssh/authorized_keys"
#
#--------------------------- CONNECT TO VM FROM CONEMU USING SSH ---------------
#Path ConeMu's executable
#$conemu = "C:\Program Files\ConEmu\ConEmu64.exe"

#Virtual machine's ip
#$vmIP = "localhost"

#Ssh user
#$sshUser = "ubuntu"

#Command that will connect to the vm from conemu usign ssh
#Start-Process -FilePath $conemu -ArgumentList @("-run", "ssh -p2222 $sshUser@$vmIP")

#---------------------------------------------------------------------
#---------------------------- TO CLOSE THE VM ------------------------
# we have to close the MV manually with this command in power-shell
#
#"C:\Program Files\Oracle\VirtualBox\VBoxManage.exe" controlvm Ubuntu_Server_24 acpipowerbutton
#
#to use that command we need install the power management service (acpid in Linux)
#sudo apt update
#sudo apt install acpid
#sudo systemctl enable acpid
#sudo systemctl start acpid
#---------------------------------------------------------------------
#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaa
#---------------------------- Start the VM ----------------------------
#$VBoxManage = "C:\Program Files\Oracle\VirtualBox\VBoxManage.exe"
#$machine = "Ubuntu_Server_24"
#&"$VBoxManage" startvm "$machine" --type headless

#--------------------------- Connect to VM with ConEmu ---------------
#$conemu = "C:\Program Files\ConEmu\ConEmu64.exe"
#$vmIP = "localhost"
#$sshUser = "ubuntu"

# Ya no necesitas poner la contraseña aquí
#Start-Process -FilePath $conemu -ArgumentList @("-run", "ssh -p2222 $sshUser@$vmIP")
#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
