def call(String archive_root = "C:\Program Files\7-Zip\7z.exe", String zipped_name = "Build.7z", String workspace = "C:/Jenkins", String target_platform = "Win64", String path_to_build = "", String ftp_root = "C:\Program Files (x86)\WinSCP\WinSCP.com", String hutch_folder){
    bat "echo Zipping Build $archive_root a -t7z $workspace/Builds/$target_platform/$zipped_name" "$workspace/Building/$target_platform/$path_to_build/*"
    echo Uploading...
    //bat '"$FTP_ROOT" /command "open sftp://sean.stearns:U[wpU6}w6Z`0U[wpU6}w6Z`0@cartographer.ddns.net:9788 ""-hostkey=ssh-ed25519 255 e+2D6ADomQba2+lijDp2Hq3kCK5rizPUq3FJAt30MpU=""" "put -delete C:\\Jenkins\\workspace\\Darksiders\\Builds\\Win64\\%ZIPPED_NAME%.7z /DSG/PC_BUILDS/%ZIPPED_NAME%.7z" "exit"'
    //echo "Done!"
   // echo "Hello ${name}!\n"
}