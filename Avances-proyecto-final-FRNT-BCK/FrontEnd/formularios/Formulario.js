async function registrarUsuarios() {
    let campos = {
        nombreUsuario: document.getElementById("nombreUsuario").value,
        numeroDocumento: document.getElementById("numeroDocumento").value,
        telefonoUsuario: document.getElementById("telefonoUsuario").value,
        tipoDeUsuario: document.getElementById("tipoUsuario").value,
        tipoProducto: document.getElementById("tipoProducto").value,
        ubicacionProducto: document.getElementById("ubicacionProducto").value,
        estadoProducto: document.getElementById("estadoProducto").value
    };

    console.log(campos);

    try {
        const response = await fetch("http://localhost:8080/api/Donantes/crear", {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(campos)
        });

        if (response.ok) {
            const donanteCreado = await response.json();
            console.log("Usuario creado:", donanteCreado);
            alert("Usuario creado exitosamente");
        } else {
            const errorData = await response.json();
            console.error("Error al registrar el usuario", errorData);
            alert("Hubo un problema al registrar el usuario: " + errorData.message);
        }
    } catch (error) {
        console.error("Error en la petición", error);
        alert("Hubo un problema con la conexión al servidor");
    }
};
