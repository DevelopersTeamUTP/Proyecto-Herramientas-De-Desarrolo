# 📝 Guía de Contribución al Proyecto

¡Gracias por querer contribuir a este proyecto!  
Sigue estas pautas para mantener un flujo de trabajo claro, ordenado y colaborativo.

---

## 🌿 Convención de nombres de ramas

Formato general:

**Ejemplos:**
- `feature/login-form`
- `fix/validacion-email`
- `hotfix/error-produccion`
- `docs/actualizar-readme`

**Tipos permitidos:**
- `feature` → nueva funcionalidad.
- `fix` → corrección de errores.
- `hotfix` → parche urgente.
- `docs` → cambios en documentación.
- `test` → pruebas o QA.
- `refactor` → mejora del código sin cambiar su comportamiento.

---

## ✍️ Formato de mensajes de commit

Sigue la convención [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/):

**Ejemplos:**
- `feat(user): agregar validación de contraseña`
- `fix(api): corregir error al crear cita`
- `docs(readme): actualizar instrucciones de instalación`

**Tipos principales:**
- `feat`: nueva funcionalidad.
- `fix`: corrección.
- `docs`: documentación.
- `style`: cambios de formato (sin afectar código).
- `refactor`: reestructuración del código.
- `test`: pruebas.
- `chore`: tareas varias.

---

## 🔄 Procedimiento para Pull Requests (PR)

1. Crea tu rama desde `develop`.
2. Haz tus commits siguiendo la convención anterior.
3. Haz push a tu rama remota.
4. Abre un Pull Request (PR) hacia `main` o `develop` según corresponda.
5. Se realizará **revisión cruzada**, es decir, otro colaborador revisará tu PR antes de hacer merge.
6. Asegúrate de que todos los tests pasen y tu PR tenga una descripción clara.

---

## 🧩 Reglas de colaboración

### Branch Rules
- `main`: solo merges aprobados desde PRs. Nunca push directo.
- `develop`: rama base para desarrollo activo.
- `feature/*`: ramas temporales para nuevas funciones.
- `fix/*`: correcciones específicas.

### Tag Rules
- Se usa **SemVer**:
  - `v1.0.0` → primera versión estable.
  - `v1.1.0` → nuevas características sin romper compatibilidad.
  - `v1.1.1` → pequeñas correcciones.

---

## 🌐 Uso de Forks y flujo de sincronización

1. Haz un fork del repositorio principal:
`https://github.com/DevelopersTeamUTP/Proyecto-Herramientas-De-Desarrolo.git`.
2. Clona tu fork:
`git clone https://github.com/tu-usuario/Proyecto-Herramientas-De-Desarrolo.git`.
3. Agrega el remoto original (upstream):
`git remote add upstream https://github.com/DevelopersTeamUTP/Proyecto-Herramientas-De-Desarrolo.git`.
4. Verifica los remotos:
`git remote -v`.
5. Mantén el fork sincronizado:
`git fetch upstream`.
`git checkout develop`.
`git merge upstream/develop`.
`git push origin develop`.

---

## 🗂 Gestión de Issues, Milestones y Tableros de Proyecto

1. **Issues**  
   - Crea un issue para reportar bugs, sugerir mejoras o hacer preguntas.  
   - Usa títulos claros y descriptivos, y asigna etiquetas (`bug`, `feature`, `question`, etc.).  

2. **Milestones**  
   - Los milestones representan objetivos o versiones del proyecto.  
   - Asocia issues a milestones para planificar entregas y seguimiento de progreso.  

3. **Tableros de Proyecto (Projects)**  
   - Usa los tableros para organizar tareas, issues y PRs en columnas como `To Do`, `In Progress` y `Done`.  
   - Mueve las tarjetas a medida que el trabajo avanza para mantener el flujo de trabajo claro.  
   - Puedes vincular issues y PRs a tarjetas para que el seguimiento sea automático.

---

💬 Si tienes dudas sobre el flujo de contribución, abre un issue con el prefijo `[question]` o contacta a un mantenedor del proyecto.



