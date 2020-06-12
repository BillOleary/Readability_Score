public boolean areSiblings(File f1, File f2) {
    // implement me

        return f1 == null || f2 == null ? false :
                f1.getParent().equals(f2.getParent());
}